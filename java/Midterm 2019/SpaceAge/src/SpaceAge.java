public class SpaceAge {

    SpaceAge(double seconds) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        System.out.printf("%.2f", onEarth( seconds ) );
        System.out.printf("%.2f", onMercury( seconds ) );
        System.out.printf("%.2f", onVenus( seconds ) );
        System.out.printf("%.2f", onMars( seconds ) );
        System.out.printf("%.2f", onJupiter( seconds ) );
        System.out.printf("%.2f", onSaturn( seconds ) );
        System.out.printf("%.2f", onUranus( seconds ) );
        System.out.printf("%.2f", onNeptune( seconds ) );

    }

    double getSeconds() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onEarth( double seconds ) {

        return seconds / 31557600;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onMercury( double seconds) {
        return onEarth( seconds ) * 0.2408467;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onVenus( double seconds ) {
        return onEarth( seconds ) * 0.61519726;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onMars( double seconds ) {
        return onEarth( seconds ) * 1.8808158;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onJupiter( double seconds ) {
        return onEarth( seconds ) * 11.862615;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onSaturn( double seconds ) {
        return onEarth( seconds ) * 29.447498;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onUranus( double seconds ) {
        return onEarth( seconds ) * 84.016846;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    double onNeptune( double seconds ) {
        return onEarth( seconds ) * 164.79132;
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
