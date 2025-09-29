Hospital Locator App

📌 Overview

The Hospital Locator App is an Android application built using Kotlin, XML, and Google Maps API. It helps users quickly find nearby hospitals, view their details, and get directions.

Users first allow the app to access their location via GPS, and then the app filters and displays nearby hospitals with all essential information.

🚀 Features

Fetch user’s current location using GPS

Display nearby hospitals on Google Maps

Show hospital details (Name, Address, Contact Info)

Search hospitals by name or location

Get real-time navigation to hospitals

Simple and user-friendly UI

Works offline with locally stored hospital data (SQLite/XML/JSON)

🛠 Tech Stack

Programming Language: Kotlin

UI Design: XML (Android Layouts)

Maps & Location Services: Google Maps API, GPS

IDE: Android Studio

🎯 How It Works

1. Home Page

When the user opens the app, the home screen welcomes them and provides options to find hospitals.

<img width="466" height="968" alt="image" src="https://github.com/user-attachments/assets/2976dee2-5698-40a4-a680-b0fdd6336d43" />

2. Location Permission

The app requests the user to enable GPS to fetch the current location.

<img width="550" height="906" alt="image" src="https://github.com/user-attachments/assets/8d3f2a23-d010-4a52-899e-b896ef6252ab" />

3. Fetch the address

  <img width="561" height="955" alt="image" src="https://github.com/user-attachments/assets/6581823e-61fe-4f29-83ac-dbdca0abd259" /> 

4. Hospital List

Nearby hospitals are filtered based on the user’s location and shown in a list view.

<img width="559" height="933" alt="image" src="https://github.com/user-attachments/assets/ab8e119e-a6b7-4fa3-b60e-b1e3d7a20595" />

5. Hospital Details

Tapping on a hospital marker or list item shows its details including Name, Address, and Contact Info.

<img width="549" height="883" alt="image" src="https://github.com/user-attachments/assets/16c287d4-5b65-49fc-ba0e-58684d7ace06" />
