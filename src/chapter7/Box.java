package chapter7;

public class Box {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // compute and terurn volume
    double volume() {
        return width * height * depth;
    }
}