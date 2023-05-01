# External Config Sample

This is a sample of how to use external config files with the `spring.config.additional-location` property

* In this sample I use `/etc/secrets/` as the directory to store the sensitive portions of the configuration
* The filename `application.properties` must match the name given in `spring.config.name` property (default 'application')


`run-no-mount.sh` launches maven to build and run the application without JVM arguments (as a reference point)

`run-mount.sh` launches maven to build and run the application with the JVM arguments to mount the external config directory
