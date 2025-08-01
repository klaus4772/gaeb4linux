# GAEB4Linux

**GAEB4Linux** is an open-source GAEB viewer and editor designed for Linux systems. GAEB XML is a standardized data exchange format used extensively in the German construction industry for specifications, pricing, quantity takeoffs, invoicing, and calculations.

The project aims to provide a free, open-source alternative to the proprietary software currently dominating this field, with a modern and modular architecture based on Java and Vaadin.

---

## 🎯 Project Goals

- Enable Linux users to work with GAEB XML files.
- Support standard formats (X81–X87) used for tender specifications.
- Provide a modern, web-based user interface.
- Maintain an open-source and extensible architecture.

---

## 🧩 Planned Features

### Step 1 – GAEB Viewer

- Load and display GAEB files (X81–X87).
- Import/export to and from all GAEB XML formats.
- Edit prices, text additions, and bidder details.
- Show/hide XML tags.
- Export complete tender documents as PDF, including headers and footers.

### Step 2 – Create Tender Specifications

- Create new tender documents.
- Import texts or select from templates.
- Optional connection to standard service catalogs or text-generation features.
- Basic project management integration.
- XML database support for data persistence.

### Future Modules

- Request and offer management.
- Price calculation module.
- Quantity determination module.
- Invoicing module.
- Master data management (equipment, personnel, materials, subcontractors).
- Interfaces to third-party construction software.

---

## ⚙️ Features

- Load and parse GAEB XML files
- Display GAEB structures in a Vaadin-based web interface
- Communicate with an XML database (BaseX or eXist-db) via REST
- Modular code structure designed for collaboration
- Licensed under the Mozilla Public License 2.0 (MPL 2.0)

---

## 🧪 Technologies Used

| Component      | Technology        |
| -------------- | ----------------- |
| Programming    | Java 21           |
| Web UI         | Vaadin Flow       |
| Database       | BaseX or eXist-db |
| Query Language | XQuery            |
| Build Tool     | Maven             |
| License        | MPL 2.0           |

---

## 🗂️ Project Structure

```
gaeb-viewer/
├── gaeb-core/          # Java logic for GAEB parsing and domain model
├── gaeb-webui/         # Vaadin-based web application (frontend)
├── gaeb-xml-db-server/ # REST-based XML database API (BaseX or eXist-db)
├── pom.xml             # Maven parent configuration
└── README.md           # You are here
```

---

## 🚀 Getting Started

### Requirements

- Java 21  
- Maven 3.8+  
- PostgreSQL 14+ (for structured project/user data)  
- BaseX 10.7+ or eXist-db 6+ (for GAEB XML files)

### Setup Instructions

Before running the application, ensure that **both** your PostgreSQL and XML database servers are installed and running.  
PostgreSQL is used for project metadata and user management, while GAEB XML files are stored in the XML database.

```bash
# Clone the repository
git clone https://github.com/yourname/gaeb-viewer.git
cd gaeb-viewer

# Start your PostgreSQL server
# (Make sure to create the database and schema using available SQL scripts)

# Start your XML database (BaseX or eXist-db)

# Deploy XQuery endpoints to your XML DB
cp gaeb-basex-server/webapp/restxq/ <your database's REST folder>

# Run the web application
cd gaeb-webui
mvn spring-boot:run

```

---

## 🤝 Contributing

Contributions are welcome! Feel free to fork the repository, open issues, or submit pull requests. The goal is to develop a collaborative platform for open GAEB tools.

---

## 🪪 License

This project is licensed under the [Mozilla Public License 2.0 (MPL 2.0)](https://www.mozilla.org/en-US/MPL/2.0/).

To ensure license compatibility, all XML databases are accessed via REST to avoid linking with GPL-licensed code like BaseX directly. You may use eXist-db as an alternative.


