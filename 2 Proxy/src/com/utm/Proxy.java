package com.utm;

interface Votul
{
    void voteaza();
}

class implementareaVotarii implements Votul {

    @Override
    public void voteaza() {
        System.out.println("A fost votat de pe pagina web");
    }

}

class implementareaAppVotarii extends implementareaVotarii
{
    @Override
    public void voteaza()
    {
        super.voteaza();
        System.out.println("A fost votat de pe aplicatie");
    }
}
public class Proxy
{
    public static void main(String[] args)
    {
        Votul proxy = new implementareaAppVotarii();
        proxy.voteaza();
    }
}
