package org.quartz

import quartz1x.tc.demo.Person



class CreatePersonJob {

    static triggers = {
      simple repeatInterval: 5000l // execute job once in 5s seconds
    }

    def execute() {

        System.out.println("Creating new person")
        def person = new Person()
        String randomString = org.apache.commons.lang.RandomStringUtils.random(9, true, true)
        person.email = "${randomString}@${randomString}.com"
        person.firstName = randomString
        person.lastName = randomString
        person.save(flush: true)

    }
}
