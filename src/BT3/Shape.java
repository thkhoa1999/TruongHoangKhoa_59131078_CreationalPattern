
package BT3;


public abstract class Shape 
{
    String brush;
    String paper;
    String frame;
    int cout;
    
    public abstract String draw();

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }
    
    
}
