#ifndef SMART_CITY_SOCKET_SERVER_PROT_PROC_THREAD_H
#define SMART_CITY_SOCKET_SERVER_PROT_PROC_THREAD_H

void *encrypt_side_protocol_processer (void *fd);
void copy_protocol (void *pkt, char *sock_buf);

#endif //SMART_CITY_SOCKET_SERVER_PROT_PROC_THREAD_H
