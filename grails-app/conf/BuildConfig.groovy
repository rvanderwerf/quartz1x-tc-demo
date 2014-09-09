grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
grails.project.dependency.resolver = "maven"
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve

    repositories {
        inherits true // Whether to inherit repository definitions from plugins
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()
        mavenRepo "http://repo.terracotta.org/maven2"

        // uncomment these to enable remote dependency resolution from public Maven repositories
        //mavenCentral()
        //mavenLocal()
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

        // runtime 'mysql:mysql-connector-java:5.1.16'
        /*compile 'net.sf.ehcache:ehcache-core:2.3.2'
        compile 'org.terracotta:terracotta-toolkit-1.1-runtime:2.1.0'
        compile 'org.terracotta.quartz:quartz-terracotta:1.2.1'*/
        runtime 'net.sf.ehcache:ehcache-core:2.6.6'
        runtime 'net.sf.ehcache:ehcache-terracotta:2.6.6'
        runtime 'org.terracotta:terracotta-toolkit-1.6-runtime:5.5.0'

        runtime 'org.terracotta.quartz:quartz-terracotta:2.3.5'
    }

    plugins {
        runtime ":hibernate:$grailsVersion"
        runtime ":jquery:1.7.1"
        runtime ":resources:1.1.6"
        compile ':quartz:1.0-RC7'
        // Uncomment these (or add new ones) to enable additional resources capabilities
        //runtime ":zipped-resources:1.0"
        //runtime ":cached-resources:1.0"
        //runtime ":yui-minify-resources:0.1.4"
        runtime ':hibernate:3.6.10.2'
        compile ':scaffolding:1.0.0'
        build ':tomcat:7.0.42'
    }
}
