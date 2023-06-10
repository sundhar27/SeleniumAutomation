package week3.day1;
    class iOS {
        void startApp() {
            System.out.println("App started");
        }

        void increaseVolume() {
            System.out.println("Volume increased");
        }

        void shutDown() {
            System.out.println("Shutting down");
        }
    }

    class iPhone extends iOS {
        void makeCall() {
            System.out.println("Making a call");
        }

        void sendSms() {
            System.out.println("Sending SMS");
        }
    }

    class iPad extends iOS {
        void watchMovie() {
            System.out.println("Watching movie");
        }
    }


    public class MyPhone {
        public static void main(String[] args) {
            iPhone myIphone = new iPhone();


            myIphone.startApp();
            myIphone.increaseVolume();
            myIphone.makeCall();
            myIphone.sendSms();
            myIphone.shutDown();

//            myIphone.watchMovies;

            /*
             we cant access iPad methods, because we create only obj for iPhone sub-class
             */
        }
    }


