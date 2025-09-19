package LLDApplication.RideSharingApplication.Model;

public enum Scaling {
    ONE(1.0),
    ZERO_POINT_SEVEN(0.7),
    ZERO_POINT_FIVE(0.5);

    public final double factor;

    Scaling(double factor) {
        this.factor = factor;
    }
}
