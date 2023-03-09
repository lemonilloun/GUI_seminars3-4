package org.example;

import java.util.Arrays;


public class Vector {
    //private Scanner sc = new Scanner(System.in);
    int n;
    private Double[] spaceDim;
    private double dotProduct;

    public Vector(Double[] dims) {
        this.spaceDim = Arrays.copyOf(dims, dims.length);
    }

    public double vScale(Vector another){
        if(this.spaceDim.length == another.getSpaceDim().length){
            for(int i = 0; i < spaceDim.length; i++){
                dotProduct += spaceDim[i] * another.getSpaceDim()[i];
            }
           return dotProduct;
        }else{throw new RuntimeException("Different dimensions");}
    }

    public Vector vSum(Vector another){
        if(this.spaceDim.length == another.getSpaceDim().length){
            Double[] xx = new Double[spaceDim.length];
            for(int i = 0; i < spaceDim.length; i++){
                xx[i] = spaceDim[i] + another.getSpaceDim()[i];
            }
            Vector sum = new Vector(xx);
            return sum;
        }else{throw new RuntimeException("Different dimensions");}
    }

    public Vector vSub(Vector another){
        if(this.spaceDim.length == another.getSpaceDim().length){
            Double[] xx = new Double[spaceDim.length];
            for(int i = 0; i < spaceDim.length; i++){
                xx[i] = spaceDim[i] - another.getSpaceDim()[i];
            }
            Vector sub = new Vector(xx);
            return sub;
        }else{throw new RuntimeException("Different dimensions");}
    }

    public Vector vCross(Vector another){

        if(this.spaceDim.length == another.getSpaceDim().length && spaceDim.length == 3){
            Double[] xx = new Double[spaceDim.length];
            xx[0] = spaceDim[1] * another.getSpaceDim()[2] - spaceDim[2] * another.getSpaceDim()[1];
            xx[1] = spaceDim[2] * another.getSpaceDim()[0] - spaceDim[0] * another.getSpaceDim()[2];
            xx[2] = spaceDim[0] * another.getSpaceDim()[1] - spaceDim[1] * another.getSpaceDim()[0];
            Vector cross = new Vector(xx);
            return cross;
        }else{throw new RuntimeException("Different dimensions");}
    }

    public double vDegree(Vector another){

        if(this.spaceDim.length == another.getSpaceDim().length){
            double dotProduct = 0;
            for(int i = 0; i < spaceDim.length; i++){
                dotProduct += spaceDim[i] * another.getSpaceDim()[i];
            }
            double magnitude1 = magnitude(spaceDim);
            double magnitude2 = magnitude(another.getSpaceDim());

            double angle = Math.acos(dotProduct / (magnitude1 * magnitude2));

            return Math.toDegrees(angle);

        }else{throw new RuntimeException("Different dimensions");}
    }

    public double vLength(Vector another){

        if(this.spaceDim.length == another.getSpaceDim().length){
            return magnitude(another.getSpaceDim());
        }else{throw new RuntimeException("Different dimensions");}
    }

    public double vSquare(Vector another){

        if(this.spaceDim.length == another.getSpaceDim().length){
            return magnitude(vCross(another).getSpaceDim());
        }else{throw new RuntimeException("Different dimensions");}
    }


    public Double[] getSpaceDim() {
        return spaceDim;
    }
    private double magnitude(Double[] dims){
        double res = 0;
        for (double x: dims){
            res += x * x;
        }
        return Math.sqrt(res);
    }


    @Override
    public String toString(){
        String res = "Координаты вектора: \n(";
        for (Double x: spaceDim){
            res += x + ",";
        }
        return res + ")";
    }
}
