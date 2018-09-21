
package Latihan4;

class B extends A {
    
    private int b;
    public void setB (int nilai)
    {
        b = nilai;
    }
    
    public int getB ()
    {
        return b;
    }
    
    // Melakukan override terhadap method tampilkanNilai
    // yang terdapat pada kelas A
    
    public void tampilkanNilai ()
    {
        super.tampilkanNilai(); // Memanggil method dalam kelas A
        System.out.println("Nilai b : " + getB());
    }
}
