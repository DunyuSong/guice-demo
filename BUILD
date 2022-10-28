load("@rules_java//java:defs.bzl", "java_binary", "java_library")

java_library(
    name="java-maven-lib",
    srcs = glob(["src/main/java/com/demo/*.java"]),
    deps = [
        "@maven//:com_google_inject_guice",
        "@maven//:javax_inject_javax_inject"],
)

java_binary(
    name = "GuiceExample",
    main_class = "main.java.com.demo.GuiceExample",
    runtime_deps=[":java-maven-lib"]
)