package photo.kwiatkowski.library.app;

            class LibraryApp {

            public static void main(String[] args) {
                final String appName = "Library v.0.9";
                System.out.println(appName);
                LibraryControl libControl = new LibraryControl();
                libControl.controlLoop();
            }

        }
