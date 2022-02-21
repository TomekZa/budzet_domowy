package pl.tomek.budżet.serwisy;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import pl.tomek.budżet.encje.AktywaEncja;
import pl.tomek.budżet.repozytorium.AktywaRepozytorium;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class TymczasoweNieprawdziweRepozytorium implements AktywaRepozytorium {
    @Override
    public List<AktywaEncja> findAll() {
        return null;
    }

    @Override
    public List<AktywaEncja> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<AktywaEncja> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<AktywaEncja> findAllById(Iterable<UUID> uuids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public void delete(AktywaEncja entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends UUID> uuids) {

    }

    @Override
    public void deleteAll(Iterable<? extends AktywaEncja> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends AktywaEncja> S save(S entity) {
        return null;
    }

    @Override
    public <S extends AktywaEncja> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<AktywaEncja> findById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(UUID uuid) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends AktywaEncja> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends AktywaEncja> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<AktywaEncja> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<UUID> uuids) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public AktywaEncja getOne(UUID uuid) {
        return null;
    }

    @Override
    public AktywaEncja getById(UUID uuid) {
        return null;
    }

    @Override
    public <S extends AktywaEncja> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends AktywaEncja> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends AktywaEncja> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends AktywaEncja> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends AktywaEncja> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends AktywaEncja> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends AktywaEncja, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
