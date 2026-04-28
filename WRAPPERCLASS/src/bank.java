public static double remainingLimit(Double limit, double used) {

    if (limit == null) {
        return 0.0;
    }

    return limit - used;
}

void main() {

    Double limit = 5000.0;
    double used = 2000.0;

    IO.println("Remaining Limit: " + remainingLimit(limit, used));
}