package spiess.swengb.geometry;

/**
 * Created by Nikolaus Spieß  on 07.11.16.
 */
public abstract class Geometry {
    protected int x;
    protected int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Geometry)) return false;

        Geometry geometry = (Geometry) o;

        if (x != geometry.x) return false;
        return y == geometry.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
