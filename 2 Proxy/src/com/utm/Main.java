
package com.utm;

interface Registru
{
    void inregistreaza();
}

class implementareaInregistrarii implements Registru {

    @Override
    public void inregistreaza() {
        System.out.println("Cartea a fost intregistrata in registru");
    }

}

class implementareaInregistrariiVirutal extends implementareaInregistrarii
{
    @Override
    public void inregistreaza()
    {
        super.inregistreaza();
        System.out.println("Cartea a fost intregistrata in registru de pe o platforma virtuala");
    }
}
 class Proxy
{
    public static void main(String[] args)
    {
        Registru proxy = new implementareaInregistrariiVirutal();
        proxy.inregistreaza();
    }
}
