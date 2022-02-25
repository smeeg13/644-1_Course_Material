package ch.hevs.aislab.demo.database.async.account;

import android.app.Application;
import android.os.AsyncTask;

import java.util.concurrent.Callable;

import ch.hevs.aislab.demo.BaseApp;
import ch.hevs.aislab.demo.database.AppDatabase;
import ch.hevs.aislab.demo.database.entity.AccountEntity;
import ch.hevs.aislab.demo.util.OnAsyncEventListener;

public class DeleteAccount implements Callable<Void> {

    private final AppDatabase database;
    private final AccountEntity account;

    public DeleteAccount(AppDatabase database, AccountEntity account) {
        this.database = database;
        this.account = account;
    }

    @Override
    public Void call(){
        database.accountDao().delete(account);
        return null;
    }
}