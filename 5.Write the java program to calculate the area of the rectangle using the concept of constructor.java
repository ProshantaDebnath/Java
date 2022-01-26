class RectangleShape
{
    int area, length, breadth;
    RectangleShape()
    {
        length = 60;
        breadth = 90;
    }
    void getArea()
    {
        area = length * breadth;
        System.out.println("Area of Rectangle : " + area);
    }
}
class RectangleAreaConstructor
{
    public static void main(String[] args)
    {
        RectangleShape result = new RectangleShape();
        result.getArea();
    }
}
