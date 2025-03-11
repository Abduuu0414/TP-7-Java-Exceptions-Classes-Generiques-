/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesGeneriques;

/**
 *
 * @author admin
 */
public class TripletH<T, U, V> {
    private T premier;
    private U second;
    private V troisieme;

    public TripletH(T premier, U second, V troisieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
    }

    public T getPremier() {
        return premier;
    }

    public U getSecond() {
        return second;
    }

    public V getTroisieme() {
        return troisieme;
    }

    public void affiche() {
        System.out.println("Premier: " + premier + ", Second: " + second + ", Troisieme: " + troisieme);
    }
}
