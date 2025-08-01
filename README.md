Project name
GAEB4Linux

Goal
GAEB XML is a standard for data exchange that is used in the German construction industry. The GAEB (Gemeinsame Ausschuss Elektronik
im Bauwesen) is responsible for its maintenance and further development.
Working with GAEB files is essential in the German construction industry. There is a wide range of tools for this, practically all
software that works with commercial data in the construction industry uses the GAEB standard. The standard includes service
specifications, prices, quantity takeoffs, invoices and even detailed calculation and measurement data. Unfortunately, almost all
available IT programs are proprietary. There are virtually no open source tools, especially for Linux.
This project aims to make GAEB software available as open source for Linux.

Planned range of functions

GAEB Viewer
Step 1 is a simple GAEB viewer with which GAEB files for service specifications (X81-X87) can be opened and displayed. It should be
possible to import and export from/to all formats. Prices, text additions and other bidder details can be entered and saved/exported.
The viewer should offer options to show/hide the XML tags. Export should also be possible as pdf file with the possibility to generate
a complete offer as pdf (text header/text footer).
Tender specifications
In the next step, it should be possible to create your own service specifications. Enter texts or take them from templates. The
connection to the interface of the standard service book or alternative functionality for text generation.
At this stage at the latest, project management would also be useful with management of extended data that goes beyond the gaeb data set. database connection.
Functions for managing and sending requests or offers.
further
module for price calculation
module for quantity determination
module for invoicing
Master data management for equipment, personnel, materials, subcontractors and/or corresponding interfaces to special software

Features
Load and parse GAEB XML files
View GAEB structures in a modern Vaadin UI
Communicate with BaseX XML database via REST
Modular design prepared for multi-user collaboration
Open Source under the Mozilla Public License 2.0 (MPL 2.0)

Project Structure

gaeb-viewer/

├── gaeb-core/            # Java logic for GAEB parsing and domain model

├── gaeb-webui/           # Vaadin-based web application (frontend)

├── gaeb-basex-server/    # BaseX RESTXQ services (XQuery API for GAEB XML)

├── pom.xml               # Maven parent configuration

└── README.md             # You are here

Technologies
Java 21
Vaadin Flow (Java-based Web UI Framework)
BaseX (native XML database, used via REST interface)
XQuery (for querying GAEB XML)
Maven (build system)
MPL 2.0 license

License Compatibility
BaseX is licensed under GPLv3, which is incompatible with MPL for direct integration.To avoid license conflicts, this project interacts with BaseX exclusively via REST API.This keeps the GAEB Viewer under the MPL 2.0 license, allowing broader reuse and modification.

Getting Started

Requirements
Java 21
Maven 3.8+
BaseX 10.7+ (installed and running)

Steps

Clone this repository:
git clone https://github.com/yourname/gaeb-viewer.git
cd gaeb-viewer

Start BaseX HTTP server:
./basex/bin/basexhttp

Deploy your XQuery endpoints in gaeb-basex-server/webapp/restxq/

Run the Java Web UI:
cd gaeb-webui
mvn spring-boot:run

Communication Example

BaseX RESTXQ Endpoint (gaeb-basex-server/webapp/restxq/hello.xq)

declare
  %rest:GET
  %rest:path("/gaeb/hello")
function local:hello() {
  <message>Hello from BaseX!</message>
};

Java REST Client

public String getHello() throws IOException {
    var connection = (HttpURLConnection)
        new URL("http://localhost:8984/gaeb/hello").openConnection();
    connection.setRequestMethod("GET");
    return new String(connection.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
}

Contributing

Feel free to fork, open issues, or submit pull requests.This project is designed to grow into a collaborative GAEB project platform.

License

This project is licensed under the Mozilla Public License 2.0 (MPL 2.0).

