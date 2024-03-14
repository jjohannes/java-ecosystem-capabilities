plugins {
    id("org.gradlex.java-dependencies")
    id("application")
}

application {
    mainClass.set("dummy.DummyClass")
}

dependencies {
    implementation("org.apache.tomcat:tomcat-catalina:9.0.68")
    implementation("io.undertow:undertow-servlet:2.3.0.Final")
}
