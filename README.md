# Understanding GitHub Repository Settings and GitHub Actions

This repository contains a simple Java application and a very basic GitHub Actions workflow to build it and test it. Detail on how to
build and run the application locally are provided below.

## Task



## Build and Run the Application Locally

### Prerequisites

A `Java 17` JDK and `Maven 3.8.3` are required to build and run the application locally.

### Build

```sh
mvn clean package
```

## Run

```sh
cd target/classes
java com.bbraun.assesment.App <num>
```