GAEB4Linux

GAEB4Linux is an open-source GAEB viewer and editor designed for Linux systems. GAEB XML is a standardized data exchange format used extensively in the German construction industry for specifications, pricing, quantity takeoffs, invoicing, and calculations.

The project aims to provide a free, open-source alternative to the proprietary software currently dominating this field, with a modern and modular architecture based on Java and Vaadin.
🎯 Project Goals

    Enable Linux users to work with GAEB XML files.
    Support standard formats (X81–X87) used for tender specifications.
    Provide a modern, web-based user interface.
    Maintain an open-source and extensible architecture.

🧠 Architectural Approach: Hybrid Storage Model

GAEB4Linux uses a hybrid database architecture to leverage the strengths of both XML-native and relational data models:
XML Database (BaseX or eXist-db)

    Stores GAEB XML files in their original structure.
    Ideal for executing complex XQuery/XPath operations.
    Maintains full fidelity of the GAEB format.

Relational Database (PostgreSQL)

    Manages project metadata, users, roles, and transactional data.
    Suitable for multi-user environments, project tracking, invoicing, and master data (e.g., materials, personnel).
    Ensures consistency and reliability with ACID compliance.

Integration Strategy

    Projects reference GAEB XML files via URI or unique IDs.
    The backend synchronizes business logic between both data sources.
    This design ensures scalability, fast query performance for structured data, and flexibility for XML-based processing.

Result: A robust, scalable system combining the semantic richness of XML with the structural integrity of relational databases.
🧩 Planned Features
Step 1 – GAEB Viewer

    Load and display GAEB files (X81–X87).
    Import/export to and from all GAEB XML formats.
    Edit prices, text additions, and bidder details.
    Show/hide XML tags.
    Export complete tender documents as PDF, including headers and footers.

Step 2 – Create Tender Specifications

    Create new tender documents.
    Import texts or select from templates.
    Optional connection to standard service catalogs or text-generation features.
    Basic project management integration.
    XML database support for data persistence.

Future Modules

    Request and offer management.
    Price calculation module.
    Quantity determination module.
    Invoicing module.
    Master data management (equipment, personnel, materials, subcontractors).
    Interfaces to third-party construction software.

⚙️ Features

    Load and parse GAEB XML files
    Display GAEB structures in a Vaadin-based web interface
    Communicate with an XML database (BaseX or eXist-db) via REST
    Modular code structure designed for collaboration
    Licensed under the Mozilla Public License 2.0 (MPL 2.0)

🧪
