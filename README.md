# Understanding Repository Settings and Actions

This repository contains a simple Java application and a very basic GitHub Actions workflow to build it and test it. Detail on how to
build and run the application locally are provided below.

## Assesment Task

The repository currently contains a very basic [build.yml](.github/workflows/build.yml) workflow that builds the application. The task is to
extend this setup to also validate pull requests. The [GitHub Docs](https://docs.github.com/) contain all the information required to solve
this task.

Fork this repository into your private account and try to implement the following requirements:

### Requirements

- A new *check workflow* should be triggered on pull requests targeting the `main` branch.
- The workflow should build the application and run the unit tests.
- The workflow should fail if the compilation or unit tests fail.
- The repository should be configured to only allow pushes into the `main` branch done by pull requests.
- The repository should contain a protection rule that only allows merging pull requests into `main` if the new *check workflow* passes.
- The *check workflow* should publish the unit test results as a comment on the pull request regardless of whether the workflow passes or fails.

## Build and Run the Application Locally

### Prerequisites

A `Java 17` JDK and `Maven 3.8` are required to build and run the application locally.

### Build

```sh
mvn clean package
```

## Run

```sh
cd target/classes
java com.bbraun.assesment.App <num>
```