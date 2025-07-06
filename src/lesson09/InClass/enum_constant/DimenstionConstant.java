package lesson09.InClass.enum_constant;

public enum DimenstionConstant {
    //val of LENGTH = 1.0
    //val of WIDTH = 2.0
    //don't put anything before collection
    //enum => first line always should be collections
    LENGTH(1.0), WIDTH(2.0);
    private double dimension;
    //the following constructor is always private only
     DimenstionConstant(double dimension) {
        this.dimension = dimension;
    }

    public double getDimension() {
        return dimension;
    }
}
