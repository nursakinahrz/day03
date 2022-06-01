package myapp;


public class Car implements Controllable {

        //properties, members of the class
        private String colour;
        protected String make;
        private Integer engineCapicty;
        private Boolean started = false;
        private long startedSince;

        // get is to get the property, set is to change
        // a pair of get with something and set with something is called getters and setters
        public void setColour(String c) {
            this.colour = c;
        }
        public String getColour() {
            return this.colour;
        }

        public void setEngineCapacity(Integer capacity) {
            this.engineCapicty = capacity;
        
        }
        public Integer geIntegerCapacity() {
            return this.engineCapicty;
        }

        public String getMake() {
            return make;
        }
        public void setMake(String make) {
            this.make = make;
        }
        public Integer getEngineCapicty() {
            return engineCapicty;
        }
        public void setEngineCapicty(Integer engineCapicty) {
            this.engineCapicty = engineCapicty;
        }
        public Boolean isStarted() {
            return started;
        }
        public void setStarted(Boolean started) {
            this.started = started;
        }

        public Integer getDrivingDuration() {
            if (this.isStarted())
            //converted into ms --> sec
            return (System.currentTimeMillis() - this.startedSince) / 1000;
            return (long)-1; 

        }
        public void getMain() {
            return main;
        }
        public void setMain(void main) {
            this.main = main;
        }
        //behaviour - methods
        public void start() {
            if (this.started) {
                System.out.println("Your car is running");
            } else {
                System.out.println("Vroom..");
                this.started = true;
                // the miliseconds since 0000 Jan 1 1970 
                this.startedSince = System.currentTimeMillis();
            }
        }
        public void stop() {
            if (this.started) {
                System.out.println("Your car is not running..");
            } else {
                System.out.println("Splutter stop..");
                this.started = true;

            }
        }
    }

