class Distance {
    int kilometer;
    int meter;
    int centimeter;

  
    Distance() {
        kilometer = 0;
        meter = 0;
        centimeter = 0;
    }

    Distance(int km, int m, int cm) {
        kilometer = km;
        meter = m;
        centimeter = cm;
        normalize();
    }


    Distance(Distance d) {
        this.kilometer = d.kilometer;
        this.meter = d.meter;
        this.centimeter = d.centimeter;
    }


    void normalize() {
        if (centimeter >= 100) {
            meter += centimeter / 100;
            centimeter = centimeter % 100;
        }
        if (meter >= 1000) {
            kilometer += meter / 1000;
            meter = meter % 1000;
        }
    }

    // 1. addDistance(Distance) Adds to current object
    void addDistance(Distance d) {
        this.kilometer += d.kilometer;
        this.meter += d.meter;
        this.centimeter += d.centimeter;
        normalize();
    }

    // 2. addDistance(Distance) Returns a new Distance object
    Distance addDistanceReturn(Distance d) {
        Distance temp = new Distance();
        temp.kilometer = this.kilometer + d.kilometer;
        temp.meter = this.meter + d.meter;
        temp.centimeter = this.centimeter + d.centimeter;
        temp.normalize();
        return temp;
    }

    // 3. addDistance(Distance, Distance) Stores sum of two distances in current object
    void addDistance(Distance d1, Distance d2) {
        this.kilometer = d1.kilometer + d2.kilometer;
        this.meter = d1.meter + d2.meter;
        this.centimeter = d1.centimeter + d2.centimeter;
        normalize();
    }

    
    void display() {
        System.out.println(kilometer + " km " + meter + " m " + centimeter + " cm");
    }

    
    public static void main(String[] args) {
       
        Distance d1 = new Distance(2, 500, 80);
        Distance d2 = new Distance(1, 800, 50);

        System.out.print("Distance 1: ");
        d1.display();
        System.out.print("Distance 2: ");
        d2.display();

        // Using addDistance(Distance) - modifies d1
        d1.addDistance(d2);
        System.out.print("After adding d2 to d1: ");
        d1.display();

        // Using copy constructor
        Distance d3 = new Distance(d1);
        System.out.print("Copy of d1 (d3): ");
        d3.display();

        // Using addDistanceReturn(Distance) ,returns new object
        Distance d4 = d1.addDistanceReturn(d2);
        System.out.print("New distance (d1 + d2): ");
        d4.display();

        // Using addDistance(Distance, Distance) ,stores in current object
        Distance d5 = new Distance();
        d5.addDistance(d1, d2);
        System.out.print("Sum of d1 and d2 stored in d5: ");
        d5.display();
    }
}
