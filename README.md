Hospital Locator App

📌 Overview
The Hospital Locator App is an Android application built using Kotlin, XML, and Google Maps API. It helps users quickly find nearby hospitals, view their details, and get directions.

Users first allow the app to access their location via GPS, and then the app filters and displays nearby hospitals with all essential information.

🚀 Features

✔️ Fetch user’s current location using GPS

✔️ Display nearby hospitals on Google Maps

✔️ Show hospital details (Name, Address, Contact Info)

✔️ Search hospitals by name or location

✔️ Get real-time navigation to hospitals

✔️ Simple and user-friendly UI

✔️ Works offline with locally stored hospital data (SQLite/XML/JSON)

🛠️ Tech Stack

Programming Language: Kotlin

UI Design: XML (Android Layouts)

Maps & Location Services: Google Maps API, GPS

IDE: Android Studio


🎯 How It Works

1️⃣ User opens the app and grants location permission

2️⃣ The app fetches the user’s current GPS location

3️⃣ Nearby hospitals (from local data) are filtered based on distance

4️⃣ Hospitals are displayed as markers on Google Maps

5️⃣ User taps a marker to view details (name, address, contact info)

6️⃣ User can choose navigation to the hospital using Google Maps

📌 Cloning & Running the Project
1️⃣ Clone the Repository
git clone https://github.com/YourUsername/Hospital-Locator-App.git
cd Hospital-Locator-App

2️⃣ Open in Android Studio

Open Android Studio → Open an existing project

Select the Hospital-Locator-App folder

3️⃣ Add Google Maps API Key

Go to Google Cloud Console
 → Create API key for Maps SDK

Add the API key in AndroidManifest.xml:

<meta-data
    android:name="com.google.android.geo.API_KEY"
    android:value="YOUR_API_KEY_HERE"/>

SAMPLE SCREENSHOTS:

HOME PAGE

<img width="466" height="968" alt="image" src="https://github.com/user-attachments/assets/2976dee2-5698-40a4-a680-b0fdd6336d43" />

PROMPT TO TURN ON LOCATION

<img width="550" height="906" alt="image" src="https://github.com/user-attachments/assets/8d3f2a23-d010-4a52-899e-b896ef6252ab" />

ADDRESS PAGE

<img width="561" height="955" alt="image" src="https://github.com/user-attachments/assets/6581823e-61fe-4f29-83ac-dbdca0abd259" />

HOSPITAL LIST PAGE

<img width="559" height="933" alt="image" src="https://github.com/user-attachments/assets/ab8e119e-a6b7-4fa3-b60e-b1e3d7a20595" />

HOSPITAL INFORMATION 

<img width="549" height="883" alt="image" src="https://github.com/user-attachments/assets/16c287d4-5b65-49fc-ba0e-58684d7ace06" />





