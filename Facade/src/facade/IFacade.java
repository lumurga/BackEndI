package facade;


    public interface IFacade {

        /* ================== Métodos ====================== */

        void buscar(String fechaIda, String fechaVuelta, String origen, String destino);
        void buscar(String fechaEntrada, String fechaSalida, String ciudad);

    }

