public enum PatentiGuida {
    A(1), B(2), C(3), NULL(0);

    private int patente;

    PatentiGuida(int patente)
    {
        this.patente = patente;
    }

    public PatentiGuida setPatenteGuida(int patente)
    {
        switch (patente)
        {
            case 0 :
                return PatentiGuida.NULL;

            case 1 :
                return PatentiGuida.A;

            case 2 :
                return PatentiGuida.B;

            case 3 :
                return PatentiGuida.C;

        }
        return PatentiGuida.NULL;
    }
}

