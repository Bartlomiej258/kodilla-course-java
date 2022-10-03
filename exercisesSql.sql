
INSERT INTO posts (USER_ID, BODY) VALUES (2,'halo');
commit ;

UPDATE posts
SET BODY = 'To delete'
WHERE ID = 7 ;
commit ;

delete from posts
where ID = 7;
commit ;
