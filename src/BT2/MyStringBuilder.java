
package BT2;


public class MyStringBuilder 
{
    String str;

    protected MyStringBuilder(Builder builder)
    {
        this.str = builder.str;
    }
    
    public static class Builder
    {
        String str = "";

        public Builder() {
        }
        
        
        public Builder addString(String s)
        {
            this.str += s;
            return this;
        }
        
        public Builder addFloat(Float f)
        {
            this.str += Float.toString(f);
            return this;
        }
        
        public Builder addBool(Boolean b)
        {
            this.str += Boolean.toString(b);
            return this;
        }
        
        public MyStringBuilder BD()
        {
            return new MyStringBuilder(this);
        }
              
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" + "str=" + str + '}';
    }
    
    
}
