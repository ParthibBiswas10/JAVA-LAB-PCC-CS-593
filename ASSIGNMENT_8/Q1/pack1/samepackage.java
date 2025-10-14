package pack1;

public class samepackage{
    public static void main(String[] args) {
        demo obj=new demo();
        obj.display();
         System.out.println("Accessing from same package:");
        // System.out.println(obj.privateval);  // Not accessible
        System.out.println("defaultval = " + obj.defaultval);     
        System.out.println("protectedval = " + obj.protectedval); 
        System.out.println("publicval = " + obj.publicval);       
    }
}


/*Question:

“Why didn’t I write import in SamePackage.java,
but write import package1.demo; in DifferentPackage.java?”

answer:

Because classes in the same package can see each other directly,
but classes in different packages need to import the other package to access its classes.

Both classes (demo and SamePackage) are in the same package → package1.
So Java already knows where to find class A.
No need to import it.

✅ Think of it like:

Two people living in the same house don’t need an address to talk — they’re already in the same place.
 */