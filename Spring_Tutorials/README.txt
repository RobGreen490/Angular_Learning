Learning Spring

Maven files explained{
    POM file: Project Object Model file is essentially your shopping list for maven. It tells maven we depend on x number of dependencies, go out and get these.

    The Maven shopping list constist of:
    Project Coordinate Elements{
        Group ID: name of company, group, or organization. convention is to use reverse domain name: com.domainName
        Artifact ID: name for this project: a1_mycoolapp
        version: a specific release version 1.0, 1.6, 2.0. If a project is under active development then: 1.0-SNAPSHOT

        Maven will go out and grab these files. version is optional. Here is an example:
        <dependencies>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>6.0.0</version>
        </dependencies>

        The easiest way to find these dependencies is to go to the maven website:
        https://central.sonatype.com
    }

}
