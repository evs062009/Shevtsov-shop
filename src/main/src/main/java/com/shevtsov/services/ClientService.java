package com.shevtsov.services;

import com.shevtsov.domain.Client;

import java.util.List;

public interface ClientService {

    /**
     * Creates and transmits a Client-object to DAO for saving.
     *
     * @param name    the name of new client.
     * @param surname the surname of new client.
     * @param age     age of new client.
     * @param phone   the phone number of new client.
     * @param email   the email of new client.
     * @return true if client was create successfully, or false otherwise.
     */
    boolean create(String name, String surname, int age, String phone, String email);

    /**
     * Creates modifying copy of exist Client-object and transmits to DAO for replace in storage.
     * The presence of the object is checked.
     * Name, surname, age, phone and email can be changed, id remains the same.
     *
     * @param id         id of client, which is modified.
     * @param newName    new name of client, which is modified.
     * @param newSurname new surname of client, which is modified.
     * @param newAge     new age of client, which is modified.
     * @param newPhone   new phone number of client, which is modified.
     * @param newEmail   new email of client, which is modified.
     * @return false if there is no such client in the storage, or true otherwise.
     */
    boolean modify(long id, String newName, String newSurname, int newAge, String newPhone, String newEmail);

    /**
     * Transmits to DAO the command to remove exist Client-object from storage.
     * The presence of the object is checked.
     *
     * @param id id of client, which is removed.
     * @return false if there is no such client in the storage, or true otherwise.
     */
    boolean remove(long id);

    /**
     * Returns sorted by natural comparison method list of all clients.
     * @return list of all clients.
     */
    List<Client> getAll();

    /**
     * Gets from dao and returns the Client-object, what has specified id.
     * @param id the id of the client, which is searched.
     * @return Client-object, if such was found, or null otherwise.
     * @throws com.shevtsov.exceptions.ObjectNotFoundExeption if Client not found
     */
    Client getClient(long id);
}