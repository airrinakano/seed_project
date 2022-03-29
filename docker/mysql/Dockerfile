FROM mysql

EXPOSE 3306
ADD ./docker/mysql/my.cnf /etc/mysql/conf.d/my.cnf
RUN chmod 644 /etc/mysql/conf.d/my.cnf

#docker runに実行される
CMD ["mysqld"]