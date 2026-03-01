🔷 GAEB4Linux

Open Source GAEB XML Viewer & future GAEB Processing Platform
Built with Java 21, Spring Boot & Vaadin
Native focus: Linux

🎯 Vision

GAEB4Linux aims to become a modular, extensible GAEB processing platform:

View GAEB XML files (DA80, DA81, X81, …)

Parse and display BoQs

Future modules: Calculation, Costing, Export, Project Management

Full GAEB tree preservation (lossless XML import)

🏗 Architecture

Multi-module Maven project:

gaeb4linux

├── gaebviewer

├── gaeb-schema-da80

└── gaeb-schema-da81

Layered Architecture:

UI → Application → Infrastructure → Domain

UI only depends on Application

Domain is pure and independent

Import process supports versioned importers

🔥 Current Status

✅ DA81 JAXB integration working

✅ Namespace detection

✅ Positions (OZ) extracted

🚧 Refactoring toward full GAEB Tree Model

🚧 Clean typed mapping instead of reflection

🧠 Planned Core Concept

The system will internally use:

A complete GAEB Tree model (lossless XML representation)

Modular domain projections for:

Viewer

Calculation

Billing

Export

This enables:

Future-proof extensibility

Support for all GAEB tags

Minimal refactoring for new modules

🛠 Tech Stack

Java 21

Spring Boot

Vaadin

JAXB (Jakarta XML Binding)

Maven Multi-Module

Linux-first development

🚀 How to run
mvn clean install
cd gaebviewer
mvn spring-boot:run

Open:

http://localhost:8080/gaeb
📌 Why this project?

Most GAEB tools are Windows-only.
GAEB4Linux is a native Linux alternative – open and extensible.

Das wirkt direkt professionell.

Wenn du willst, schreibe ich dir eine komplett fertige README.md zum Copy-Paste.
