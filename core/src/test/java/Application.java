package org.web3j.sample;


import java.util.Scanner;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Transfer;
import org.web3j.utils.Convert;
import java.math.BigDecimal;



public abstract class Application implements Web3jApplicationInterface { 

    
    public Application app;
    protected Web3j web3j;
    private Credentials credentials;  ///class scope variables
    private String password;
    private String walletFile;
    private String remoteNode;

    private static final Logger log = LoggerFactory.getLogger(Application.class); //logging object


    ///getters
    // public Web3j getWeb3jObj() {
    //     return web3j;
    // }
    // public Credentials getCredentials() {
    //     return credentials;
    // }
    // public String password() {  //can extend to create password access authentication step.
    //     return password;
    // }
    // public String walletFile() {
    //     return walletFile;
    // }
    // public String remoteNode() {
    //     return remoteNode;
    // }

    
    


    ///modular method for instiantiating web3j object.
    private void instantiateWeb3jObject() {

        String remoteNode = scanner.next();
        System.out.print("Enter remote note url: ");

        String confirmNode = scanner.next();
        System.out.print("Confirm 'yes' or 'no'. Remote note url: " + remoteNode);


        if (confirmNode == "yes") {
            Web3j web3j = Web3j.build(new remoteNode());
            log.info("Connected to Ethereum client version: " + web3j.web3ClientVersion().send().getWeb3ClientVersion());
        }
    }



    //modular method for client initializing
    public static void promptClientToInitializeApp() throws Exception {

        Scanner scanner = new Scanner(System.in);


        //get credentials from client.
        password = scanner.next();
        System.out.print("Enter your wallet password: ");

        walletFile = scanner.next();
        System.out.print("Enter your wallet file path: ");
        log.info("Creating credentials object");



        //instantiate credentials object.
        Credentials credentials = WalletUtils.loadCredentials(password, walletFile);
        log.info("Credentials object loaded");



        String action1 = scanner.next();
        System.out.print("Would you like to send Ether? 'yes' or 'no'");
            if (action1 == "yes") {

                Transfer sendtx = new createTransaction();

            }
        }


        

      public static void main(String[] args) throws Exception {

        //new Application();
        Web3jApplicationInterface app = new Application(); // app is the instance of the application object. Pass it to other classes
        app.instantiateWeb3jObject();
        app.promptClientToInitializeApp();  ///call method to initialize via command line.
        
    }      
        
}