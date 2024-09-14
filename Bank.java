package Lab6;

class Bank {
    double getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    double getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {
    double getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank {
    double getRateOfInterest() {
        return 9;
    }
}

class Main {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();

        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
    }
}