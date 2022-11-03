package pl.byczazagroda.trackexpensesappbackend.service;


import pl.byczazagroda.trackexpensesappbackend.dto.CreateWalletDTO;
import pl.byczazagroda.trackexpensesappbackend.dto.UpdateWalletDTO;
import pl.byczazagroda.trackexpensesappbackend.dto.WalletDTO;

import javax.validation.Valid;
import java.util.List;

public interface WalletService {



    WalletDTO createWallet(CreateWalletDTO createWalletDTO);

    //metoda do testów
    WalletDTO findOne(@Valid Long id);

    WalletDTO updateWallet(UpdateWalletDTO walletToUpdate);

    List<WalletDTO> getWallets();
}
