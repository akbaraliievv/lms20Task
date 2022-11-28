public class Parallelepiped {
    private double width;
    private double height;
    private double length;

    public Parallelepiped(double width, double height, double length) throws Exception {
        checkInfo(width, length, height);
    }

    private void checkInfo(double width, double height, double length) throws Exception {
        if (width < 0 || length < 0 || height < 0 || width > 20 || length > 20 || height > 20) {
            throw new Exception();
        } else {
            this.width = width;
            this.height = height;
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double area() {
        return 2 * ((height * length) + (length * width) + (height * width));
    }

    public double volume() {
        return (length * width * height);
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                '}';
    }
}
