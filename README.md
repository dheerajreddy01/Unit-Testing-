﻿# Unit-Testing-
# Java Unit Testing Project

## Project Description
This project is a sample Java application designed to demonstrate the implementation of unit tests using JUnit. The primary goal is to ensure the correctness of the application's logic through comprehensive testing.

## Features
- Basic Java application
- Unit tests with JUnit
- Maven build and dependency management

## Prerequisites
Before you begin, ensure you have the following installed:
- [Java 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- [Maven](https://maven.apache.org/install.html)

## Setup
1. **Clone the repository:**
    ```sh
    git clone https://github.com/your-username/java-unit-testing.git
    cd java-unit-testing
    ```

2. **Install dependencies:**
    ```sh
    mvn clean install
    ```

## Usage
1. **Compile the project:**
    ```sh
    mvn compile
    ```

2. **Run the application:**
    ```sh
    mvn exec:java -Dexec.mainClass="com.example.Main"
    ```

## Running Unit Tests
1. **Run all tests:**
    ```sh
    mvn test
    ```

2. **Generate test report:**
    ```sh
    mvn surefire-report:report
    ```
