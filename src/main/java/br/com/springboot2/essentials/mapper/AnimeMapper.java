package br.com.springboot2.essentials.mapper;

import br.com.springboot2.essentials.domain.Anime;
import br.com.springboot2.essentials.requests.AnimePostRequestBody;
import br.com.springboot2.essentials.requests.AnimePutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {
    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);

    public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);

    public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);
}
