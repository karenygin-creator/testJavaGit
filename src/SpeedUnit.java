public interface SpeedUnit {
    double KMH_TO_MS=1000.0/3600.0;
    double MS_TO_KMH=3600.0/1000;
    default double toMetersPerSecond(double kmh){
        return kmh*KMH_TO_MS;
    }
    default  double toKilometersPerHour(double ms){
        return ms*MS_TO_KMH;
    }

}
