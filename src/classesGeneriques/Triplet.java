/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesGeneriques;

/**
 *
 * @author admin
 * @param <T>
 */
public class Triplet<T> {
    private T premier;
    private T second;
    private T troisieme;

    public Triplet(T premier, T second, T troisieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
    }

    public T getPremier() {
        return premier;
    }

    public T getSecond() {
        return second;
    }

    public T getTroisieme() {
        return troisieme;
    }

    public void affiche() {
        System.out.println("Premier: " + premier + ", Second: " + second + ", Troisieme: " + troisieme);
    }
    
}
