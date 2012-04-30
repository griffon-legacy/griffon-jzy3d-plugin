griffon.project.dependency.resolution = {
    inherits("global")
    log "warn" 
    repositories {
        griffonHome()
        mavenCentral()
        // pluginDirPath is only available when installed
        String basePath = pluginDirPath? "${pluginDirPath}/" : ''
        flatDir name: "jzy3dLibDir", dirs: ["${basePath}lib"]
    }
    dependencies {
        compile 'org.jzy3d:jzy3d:0.9',
                'org.convexhull:convexhull:1.0',
                'net.sf.opencsv:opencsv:2.1'
    }
}

griffon {
    doc {
        logo = '<a href="http://griffon.codehaus.org" target="_blank"><img alt="The Griffon Framework" src="../img/griffon.png" border="0"/></a>'
        sponsorLogo = "<br/>"
        footer = "<br/><br/>Made with Griffon (@griffon.version@)"
    }
}


log4j = {
    // Example of changing the log pattern for the default console
    // appender:
    appenders {
        console name: 'stdout', layout: pattern(conversionPattern: '%d [%t] %-5p %c - %m%n')
    }

    error 'org.codehaus.griffon',
          'org.springframework',
          'org.apache.karaf',
          'groovyx.net'
    warn  'griffon'
}
