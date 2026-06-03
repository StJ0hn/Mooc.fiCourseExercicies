package Part_I.Module_06.Ex_03_MessagingService;

public class MainProgram {
    public static void main(String[] args) {
        MessagingService service = new MessagingService();

        Message msg1 = new Message("Leo", "Olá, mundo! Esta é uma mensagem curta.");

        String textoGigante = "A".repeat(300);
        Message msg2 = new Message("Spammer", textoGigante);

        String textoLimite = "B".repeat(280);
        Message msg3 = new Message("Testador", textoLimite);

        service.add(msg1);
        service.add(msg2);
        service.add(msg3);

        System.out.println("Total de mensagens na lista: " + service.getMessages().size());

        for (Message m : service.getMessages()) {
            System.out.println(m);
        }
    }
}
