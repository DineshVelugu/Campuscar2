# CR AutoBrowser (Android Auto Fixed)

Fixed version that properly registers with Android Auto so it appears in the car screen and Customize apps.

## How to build the APK using GitHub

1. Create a new repository on GitHub (public or private)
2. Upload all files from this folder into the repo
3. Go to the **Actions** tab
4. The workflow will automatically run and build the APK
5. Download the APK from the **Artifacts** section of the successful run

The APK will be named `app-debug.apk`.

## What was fixed
- Added proper `CarAppService` (this was missing in the original)
- Correct intent filter so Android Auto detects the app
- Minimal working screens so it launches on the car dashboard

You can now expand it with full WebView, bookmarks, ad-block, etc.
