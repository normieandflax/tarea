PGDMP     /    	        	        {           tarea    15.2    15.2                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16409    tarea    DATABASE     g   CREATE DATABASE tarea WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'C';
    DROP DATABASE tarea;
                postgres    false            ?            1259    16410    tarea    TABLE     ?   CREATE TABLE public.tarea (
    id integer NOT NULL,
    descripcion character varying,
    fecha_creacion date,
    vigente boolean
);
    DROP TABLE public.tarea;
       public         heap    postgres    false            ?            1259    16413    tarea_id_seq    SEQUENCE     ?   CREATE SEQUENCE public.tarea_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.tarea_id_seq;
       public          postgres    false    214                       0    0    tarea_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE public.tarea_id_seq OWNED BY public.tarea.id;
          public          postgres    false    215            o           2604    16414    tarea id    DEFAULT     d   ALTER TABLE ONLY public.tarea ALTER COLUMN id SET DEFAULT nextval('public.tarea_id_seq'::regclass);
 7   ALTER TABLE public.tarea ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    215    214                       0    16410    tarea 
   TABLE DATA           I   COPY public.tarea (id, descripcion, fecha_creacion, vigente) FROM stdin;
    public          postgres    false    214   1
       	           0    0    tarea_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.tarea_id_seq', 44, true);
          public          postgres    false    215            q           2606    16419    tarea tarea_pk 
   CONSTRAINT     L   ALTER TABLE ONLY public.tarea
    ADD CONSTRAINT tarea_pk PRIMARY KEY (id);
 8   ALTER TABLE ONLY public.tarea DROP CONSTRAINT tarea_pk;
       public            postgres    false    214                ?   x?]?1?0E??S???R??)Ht?????!Mz~
A??ߓ??7{???U??}???Gg?n?????X@v??d?V.΀?,M???eW?? ??xT~?H??&[?O?%/?ĵT|???y?u?Ty?????;u     