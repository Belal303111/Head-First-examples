public class Dog {
        private int size;
        private String name;
        public void setSize(int s)
        {
            size=s;
        }
        public void setName(String n)
        {
            name=n;
        }
        public void pringInfo()
        {
            System.out.println("The dog name:"+name+"\nThe dog size:"+size);
        }
        public void bark()
        {
            System.out.println("Ruff! Ruff!");
        }
    }
