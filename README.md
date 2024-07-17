# Testing Automation Web Demoblaze


This project is a technical challenge with serenity BDD screenplay

The challenge was to automate 2 use cases

## the first was:

Register a new user on the Product Store page.

![image](https://github.com/user-attachments/assets/6914f4c2-d195-4789-8068-38f1e953c12d)


## The second:

Make a purchase, adding products to the cart.

![image](https://github.com/user-attachments/assets/fa4e2714-83d7-49b8-932b-545720681abf)


## Tabla de Contenidos
- [Introducción](#Introduction)
- [Pruebas con Serenity](#pruebas-con-serenity)
- [Requisitos previos](#requisitos-previos)
- [Ejecutar las pruebas localmente](#ejecutar-las-pruebas-localmente)

# Introduction

The project is about a shopping cart on a website called demoblaze, the serenity bdd testing framework was used with the screenplay design pattern, cucumber to document our tests applying BDD and gradle for our dependency manager

The url of the project that was automated was the following:


## URL: https://www.demoblaze.com/



## Prerequisites to install the project


The project is developed in Java with Gradle so it will install the following software:


## JDK 17, download link:


https://download.oracle.com/java/17/archive/jdk-17_windows-x64_bin.zip


## Gradle:, download link:

https://gradle.org/


## Your favorite IDE, including :
Intellij IDEA: To run features or scenarios tests it will configure:


## How to run the tests locally?

To run the tests, enter your preferred ide, I highly recommend IntelliJ IDEA, go to your terminal and enter the following command:

./gradlew clean test
